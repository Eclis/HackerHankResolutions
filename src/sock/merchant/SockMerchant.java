package sock.merchant;

import java.util.ArrayList;
import java.util.List;

public class SockMerchant {

	public static void main(String[] args) {
		int n = 9;
        int c[] = new int[]{10,20,20,10,10,30,50,10,20};
        
        List<Integer> list = new ArrayList<Integer>();

        int totalSocks = 0;
        for (int i : c) {
        	if (list.contains(i)) {
        		totalSocks++;
        		list.remove((Object)i);
        	} else {
        		list.add(i);
        	}
		}
        System.out.println(totalSocks);

	}

}
