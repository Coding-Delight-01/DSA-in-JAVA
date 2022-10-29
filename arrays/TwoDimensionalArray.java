class Main
{
    public static void main(String args[])
    {
        // declaring and initializing 2D array
        int array_2d[][] = { {1,2,3},{4,5,6},{7,8,9} };
 
        System.out.println("The two-dimensional array is as follows:");
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                 System.out.print(array_2d[i][j] + " ");
 
            System.out.println();
        }
    }
