package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	int totalneOdrzucenie = 0;

    public int reportRejected() {
        return totalneOdrzucenie;
    }

    public void countIn(int in) {
	    if (!callCheck() && in > peekaboo())
	            totalneOdrzucenie++;
        else
            super.countIn(in);
    }
}
