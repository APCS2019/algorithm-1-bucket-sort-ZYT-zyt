    public void BucketSort(int[] a){
      int max = a[0];
      for(int i = 1; i < a.length; i++){
        if(a[i] > max)
          max = a[i];
      }
      int[] b = new int[max+1];
      for(int i : a)
        b[i]++;
      for(int i = 0; i < b.length; i++){
        for(int j = 0; j < b[i]; j++)
          System.out.print( i + " ");
      }
    }
