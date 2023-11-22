# JAVAEE-DAC
## assignment 1
menue driven
                      
                        import java.util.ArrayList;
                        import java.util.Scanner;
                        
                        public class Student {
                            char ok;
                           private    int roll;
                           private   float per;
                        Student(){
                            roll=0;
                            per=0f;
                        }
                        Student(int a,float b){
                            roll=a;
                            per=b;
                        }
                        public void show(){
                            System.out.println("Roll number :"+roll+" Percent :"+per);
                        }
                        
                            public int getRoll() {
                                return roll;
                            }
                        
                            public void setRoll(int roll) {
                                this.roll = roll;
                            }
                        
                            public float getPer() {
                                return per;
                            }
                        
                            public void setPer(float per) {
                                this.per = per;
                            }
                        
                        }
                        class CollegeStudent extends  Student{
                           private int semester;
                            CollegeStudent(){
                                semester=0;  ok='c';
                            }
                            CollegeStudent(int sam,int roll,float per){
                                setRoll(roll);
                                setPer(per);
                                semester=sam;
                                ok='c';
                            }
                        
                            @Override
                            public void show() {
                                System.out.println("Roll number :"+getRoll()+" Percent :"+getPer()+" Semester :"+semester);
                            }
                        }
                        class  SchoolStudent extends  Student{
                            private  int className;
                            SchoolStudent(){
                                className=0;
                                ok='s';
                            }
                            SchoolStudent(int s,int roll,float per){
                        className =s;
                                setRoll(roll);
                                setPer(per);
                                ok='s';
                            }
                            @Override
                            public void show() {
                                System.out.println("Roll number :"+getRoll()+" Percent :"+getPer()+" Class :"+className);
                            }
                        }
                        class Xyz{
                            public static void main(String[] args) {
                                Scanner sc= new Scanner(System.in);
                                ArrayList<Student> al=new ArrayList<>();
                                while(true){
                                    System.out.println("Enter 1 two fill COllegeStudent Details");
                                    System.out.println("Enter 2 two fill SchoolStudent Details");
                                    System.out.println("Enter 3 to find ROlL number is of College Student or Class Student");
                                    System.out.println("Enter 4 to display all entered records");
                                    System.out.println("Enter 5 to count grade A students");
                                    System.out.println("Enter 0 to quit");
                                    int a=sc.nextInt();
                                    if(a==0){
                                        break;
                                    }
                                    if(a==1){
                                        System.out.println("Enter semester");
                                        int sam=sc.nextInt();
                                        System.out.println("Enter Roll number");
                                        int rol=sc.nextInt();
                                        System.out.println("Enter percentage");
                                        float per=sc.nextFloat();
                                        CollegeStudent c=new CollegeStudent(sam,rol,per);
                                        al.add(c);
                                    }
                                    if(a==2){
                                        System.out.println("Enter class");
                                        int sam=sc.nextInt();
                                        System.out.println("Enter Roll number");
                                        int rol=sc.nextInt();
                                        System.out.println("Entr percentage");
                                        float per=sc.nextFloat();
                                        SchoolStudent s=new SchoolStudent(sam,rol,per);
                                    al.add(s);
                                    }
                                    if(a==3){
                        
                                        System.out.println("Enter Roll number to find");
                                        int y= sc.nextInt();
                                        for (int i = 0; i <al.size() ; i++) {
                                            if(al.get(i).getRoll()==y){
                                                if(al.get(i).ok=='c'){
                                                    System.out.println("Matched Roll number is of College type");
                                                }else if(al.get(i).ok=='s'){
                                                    System.out.println("Matched Roll number is of School type");
                                                }
                                            }
                                        }
                                    }
                                    if(a==4){
                                        //display
                                        for (int i = 0; i <al.size() ; i++) {
                                            al.get(i).show();
                                        }
                                    }
                                    if(a==5){
                                        int count=0;
                                        for (int i = 0; i <al.size() ; i++) {
                                            if (al.get(i).getPer()>75){
                                                count++;
                                            }
                                        }
                                        System.out.println(count);
                                    }
                            }
                            }
                        }
