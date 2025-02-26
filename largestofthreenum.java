class largestofthreenum{
    public static void main(String []args){
        int a=9,b=5,c=8;
       int  largest=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.print(largest);
    }
}