
public class Test
{
    boolean status1=false;
    String winner1="";
    int num1=0;
    String player1="";
    int gridNumber1;
    int[] A = new int[9];
    
     public Test() {
           
    }
    
    public void gridChange(String player, int gridNumber) {
       player1=player;
       gridNumber1=gridNumber;
        if (player1=="X") {
        A[gridNumber1]=10;
     }
        if (player1=="O") {
        A[gridNumber1]=100;    
     }
    }
    
   public boolean win() {
    boolean status=false;
    int num=0;
    for (int i=0; i<3; i++) {
        if (A[i]==A[i+3] && A[i+3]==A[i+6]) { //3 in a column
            status=true;
            num=A[i]+A[i+3]+A[i+6];
    }
   }
   for (int i=0; i<9; i=i+3) {
        if (A[i]==A[i+1]&&A[i+1]==A[i+2]) { //3 in a row
            status=true;
            num=A[i]+A[i+1]+A[i+2];
    }
   }
    if (A[0]==A[4]&&A[4]==A[8]) { //3 sideways
        status=true;
        num=A[0]+A[4]+A[8];
    }
    if (A[6]==A[4]&&A[4]==A[2]) { //3 sideways
        status=true;
        num=A[6]+A[4]+A[2];
    }
    status1=status;
    num1=num;
    return status;
  } 
  
  public String winner() {
   String winner="";
   if (num1==300) {
       winner.equals("O wins");
    }
   else if (num1==30) {
       winner.equals("X wins");
    }
   else {
      winner.equals("tie");
    }
   winner1 = winner;
   return winner;
   
 }
    
  public boolean getStatus() {
    return status1;
    }
    
  public int getNum() {
    return num1;
    } 
    
  public String getWinner() {
    return winner1;
    } 
 
 public  String[] Grid() {
   
        for (int i=0; i<9; i++) {
            A[i]= 0;
       }   
       String[] b = new String[9];
       int x = 0;
        while (x < A.length) {
            if (A[x] == 10)
                b[x] = "X";
            else if (A[x] == 100)
                b[x] = "O";
            else if (A[x] == 0)
                b[x]=Integer.toString(x);
            x++;
      }
    return b;
 }   
 
}

    
