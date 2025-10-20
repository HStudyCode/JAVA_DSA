package linearSearch;

public class maxWelth {
    public static void main(String[] args) {
        // Test the method with sample data
        int[][] accounts = {
            // {1, 2, 3},
            // {3, 2, 1}
            // {1,5},
            // {7,3},
            // {3,5}
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };
        
        int result = maximumWelth(accounts);
        System.out.println("Maximum wealth: " + result);
    }

    public static int maximumWelth(int[][] accounts){
        // person = row
        // account = col

        int ans= Integer.MIN_VALUE;
        for(int person = 0; person<accounts.length; person++){
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for(int account = 0; account<accounts[person].length; account++){
                sum += accounts [person] [account];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
