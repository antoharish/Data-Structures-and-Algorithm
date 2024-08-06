package Mitsogo;



class majorityElement {

 public static int MajorityElement(int[] num) {

    int majority = num[0] ;
    
    int votes = 1;

    for (int i = 1; i < num.length; i++) {

      if (votes == 0) {
        votes++;
        majority = num[i];
      } else if (majority == num[i]) {
        votes++;
      } else
        votes--;

    }
    return majority;
  }
  
  public static void main(String []args) {
	  int num[] = {2,3,4,2,2,4,4,4,};
	  System.out.println(MajorityElement(num));
	  
  }

}








