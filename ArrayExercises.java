/**
 * File: ArrayExercise.java
 * This tester is designed to call all the array processing methods
 * I am implementing in the ArrayProcessor class
 */

public class ArrayExercises {
    
    public static void main (String[] args) {
        
        ArrayProcessor ap = new ArrayProcessor();
        
        // NUMBER 1
        System.out.println("\nprint");
        int[] a = {7,8,9,6,6,6,9,10};
        ap.print(a);
        
        
        
        // NUMBER 2
        System.out.println("\nfillRand20");
        int[] a2 = new int[20];
        System.out.print("Uninitialized:\t");
        ap.print(a2);
        ap.fillRand20(a2);
        System.out.print("20 randoms:\t");
        ap.print(a2);
        
                
        
        // NUMBER 3
        System.out.println("\nremoveElement 7");
        int[] nn = {1,2,3,4,5,6,7,8,7,8,7,9};
        ap.print(nn);
        int[] newnn = ap.removeElement(nn, 7);
        ap.print(newnn);
        
        
        
        // NUMBER 4
        System.out.println("\nremoveEvens");
        int[] a3 = new int[20];
        ap.fillRand20(a3);
        ap.print(a3);
        int[] noevens = ap.removeEvens(a3);
        ap.print(noevens);
        


        // FOR REFERENCE TO HELP WITH NUMBER 5
        System.out.println("\ncompareAdjacent");
        int[] adj = {1,2,3,4,5,5,6,7};
        ap.print(adj);
        boolean eq = ap.compareAdjacent(adj);
        System.out.println("has adjacent pair: " + eq);
        
        
        
        // NUMBER 5 --> TODO
        System.out.println("\nfindParSums 16");
        int[] sss = {1,3,8,8,10,6,4,3,16,0,20,2};
        ap.print(sss);
        System.out.println("Count of pairs that add to 16: "
            + ap.findPairSums(sss, 16));
        
        
        
        // NUMBER 6
        System.out.println("\nequalArrays");
        int[] z1 = {1,2,3,4,5};
        int[] z2 = {1,2,3,4,5};
        ap.print(z1);
        ap.print(z2);
        System.out.println("arrays are equal: " + ap.equalArrays(z1,z2));
        
        
        
        // NUMBER 7
        System.out.println("\nnoZeros");
        int[] nz = {1,2,0,0,3};
        ap.print(nz);
        int[] nzz = ap.noZeros(nz);
        ap.print(nzz);
        
        
        
        // NUMBER 8
        System.out.println("\nzerosLast");
        int[] mz = {1,0,0,0,0,4,4,0,0,0,4,5,6,7,8,9,1};
        ap.print(mz);
        ap.zerosLast(mz);
        ap.print(mz);
        
        
        
        // NUMBER 9
        System.out.println("\nzerosFirst");
        int[] bz = {8,6,7,0,0,4,7,0,0,1,2,0,4,7};
        ap.print(bz);
        ap.zerosFirst(bz);
        ap.print(bz);
        
        
        
        // NUMBER 10
        int[] mma = {6,2,1,8,9,2,3,45,77,100,4,3,2,1};
        System.out.println("\nmaxMinAve");
        ap.print(mma);
        System.out.println("max - min == " + ap.maxMinAve(mma));
        
        
        
        // NUMBER 11 --> TODO
        System.out.println("\ncirbuf");
        int[] cir = {1,2,3,4,5};
        System.out.print("buffer: ");
        ap.print(cir);
        ap.cirbuf(cir);
        System.out.print("buffer: ");
        ap.print(cir);
        ap.cirbuf(cir);
        System.out.print("buffer: ");
        ap.print(cir);
        ap.cirbuf(cir);
        System.out.print("buffer: ");
        ap.print(cir);
        ap.cirbuf(cir);
        System.out.print("buffer: ");
        ap.print(cir);
        ap.cirbuf(cir);
        System.out.print("buffer: ");
        ap.print(cir);
        
    }
}
