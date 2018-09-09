class linSearch
{

    public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    

    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 4;    
        if(linearSearch(a1, key)==-1)
            System.out.println("Not found");
        else    
            System.out.println(key+" is found");    
    }    

}