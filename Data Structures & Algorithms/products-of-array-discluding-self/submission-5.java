class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1;
        suff[n -1] = 1;

        for(int i = 1; i < n; i++)
        {
            System.out.println("pref[i]" + pref[i]);
            System.out.println("nums[i - 1]"+ nums[i - 1]);
            System.out.println("pref[i - 1]" + pref[i - 1]);

            pref[i] = nums[i - 1] * pref[i - 1];
        }

        System.out.println(Arrays.toString(pref));

        for(int j = n - 2; j >= 0 ; j--)
        {
            System.out.println("suff[j]" + suff[j]);
            System.out.println("nums[j + 1]"+ nums[j + 1]);
            System.out.println("suff[j + 1]" + suff[j + 1]);
            suff[j] = nums[j + 1] * suff[j + 1];
        }

        System.out.println(Arrays.toString(suff));

        for(int i = 0; i < n; i++)
        {
            res[i] = pref[i] * suff[i];
        }
        
        return res;
    }
}  
