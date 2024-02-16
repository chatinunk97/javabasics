class Greeting {
    public static void main(String argsp[]) {

        String[] arr2 = {"1","2","3"};
        arr2[1] = "new Tanaka";
        
        for(int i = 0 ; i < arr2.length ; i++){
            System.out.println(arr2[i]);
        }
    }
}