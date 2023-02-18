package Lab13;

public class Excersize1 {
    public static void main(String[] args) {
        String name[] = {"James Maye", "Joe Bloggs", "Jane Doe","Teresa Coughlan", "Sam Stewart"};
        double GPAs[] = {3.56,2.47,3.12,2.55,2.78};

        displayArray(GPAs, name);
        System.out.println(" ");
        SortArray(GPAs , name);
        displayArray(GPAs, name);

        System.out.println("\nAverage GPA is: " + AverageGPA(GPAs));
        System.out.println("\n Standard Deviation GPA: " + standardDeviationGPA(GPAs));

    }

    public static void SortArray(double[] GPAs, String[] name){
        for(int i = 0; i < GPAs.length-1; i++){
            double smallest = GPAs[i];
            int sub = i;
            for(int j = i+1; j < GPAs.length;j++){
                if(GPAs[j] < smallest){
                    smallest = GPAs[j];
                    sub = j;
                }
            }
            double temp = GPAs[i];
            GPAs[i] = GPAs[sub];
            GPAs[sub] = temp;

            String temp2 = name[i];
            name[i] = name[sub];
            name[sub] = temp2;
        }
    }

    public static double standardDeviationGPA(double gpa[]){
        double sum = 0; double avg = AverageGPA(gpa);
        for(int i = 0; i < gpa.length; i++){
            sum += Math.pow(avg - gpa[i], 2);
        }
        return Math.sqrt(sum/gpa.length);//square root
    }

    public static double AverageGPA(double GPA[]){
            int len = GPA.length;
            int tem = 0;
            for(int i = 0;i < len;i++){
                tem += GPA[i];
            }
            return tem/len;
    }

    public static void displayArray(double gpa[], String Name[]){
        for(int i = 0; i< Name.length;i++){
            System.out.println(Name[i] + " " +gpa[i]);
        }
    }

}
