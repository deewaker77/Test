public class strLarg {
    public static void main(String args[]){
        String s[] = {"1000", "2000", "9000", "9000", "7888", "9000", "8899"};
        int largest = Integer.parseInt(s[0]);
        int scLargest = 0;
        for(String num : s){
            if(Integer.parseInt(num)>largest){
                scLargest = largest;
                largest = Integer.parseInt(num);
            }
            else if(Integer.parseInt(num)>scLargest && Integer.parseInt(num)!=largest){
                scLargest = Integer.parseInt(num);
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + scLargest);
    }
}