package menudrivenprogramoflinklist;

public class Student {
        private String name;
        private  int marks;


        public void setName(String name) {
            this.name = name;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student " + "name= " + name + '\t' + "marks= " + marks ;
        }
    }

