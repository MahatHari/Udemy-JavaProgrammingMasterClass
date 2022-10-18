import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList(); // workes with LinkedList, HashSet, LinkedHashSet Set, all of collection interfaces.

    public Theatre(String theatreName, int numRows, int SeatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= SeatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {

        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);      //null;
//        Using Binary Search
        int foundSeat= Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >=0){
            return seats.get(foundSeat).reserve();

        }else {
            System.out.println("There is no seat "+ seatNumber);
            return false;
        }
//Binary Search Algorithm from Java Collection
//        int low=0;
//        int high= seats.size()-1;
//
//        while(low<=high){
//            System.out.println(".");
//            int mid= high/2;
//            Seat midVal= seats.get(mid);
//            int cmp= midVal.getSeatNumber().compareTo(seatNumber);
//            if(cmp<0){
//                low=mid+1;
//            }else if(cmp>0){
//                high=mid-1;
//            }else{
//                return seats.get(mid).reserve();
//            }
//        System.out.println("There is no seat "+ seatNumber);
//        return false;
//        }

       /*
       for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("There is not seat " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();*/
    }

    public void getSeats() {
        System.out.println(seats.size());
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }


    private  class  Seat implements  Comparable<Seat>{
        private final  String seatNumber;
        private  boolean reserved=false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if(!this.reserved){
                this.reserved=true;
                System.out.println("Seat "+ seatNumber + " reserved");
                return true;
            }else{
                return false;
            }

        }
        public  boolean cancel(){
            if(this.reserved){
                this.reserved=false;
                System.out.println("Reservation of seat "+ seatNumber + " is cancled");
                return true;
            }else{
                System.out.println();
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public  int compareTo(Seat seat){
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }

}
