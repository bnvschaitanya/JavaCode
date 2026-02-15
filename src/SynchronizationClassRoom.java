class whiteboard{
    String sentence;
    int studCount = 0;
    synchronized void writeSentence(String s){
        while(studCount != 0){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        this.sentence = s;
        studCount = 3;
        notifyAll();
    }
    synchronized String readSentence(){
        String s;
        while(studCount == 0){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        s = this.sentence;
        studCount = studCount - 1;
        notifyAll();
        return s;
    }
}

class teacher extends Thread{
    whiteboard w;
    teacher(whiteboard w){
        this.w = w;
    }
    public void run(){
        int x=1;
        while(x<5){
            String sentence = "Sentence " + x++;
            System.out.println("Teacher writes " + sentence);
            w.writeSentence(sentence);
        }
    }
}

class stu extends Thread{
    whiteboard w;
    String s;
    stu(String stu, whiteboard w){
        this.w = w;
        this.s = stu;
    }
    public void run(){
        while(true){
            System.out.println(s+" reads the sentence "+ w.readSentence());
        }
    }
}
public class SynchronizationClassRoom {
    public static void main(String[] args) {
        whiteboard w = new whiteboard();
        teacher t = new teacher(w);
        stu s1 = new stu("Ravi", w);
        stu s2 = new stu("Ramu", w);
        stu s3 = new stu("Rajesh", w);
        t.start();
        s1.start();
        s2.start();
        s3.start();
    }
}
