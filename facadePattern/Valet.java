public class Valet implements HotelService{
    private HotelService hotelService;
    
    public Valet(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    public Vehicle pickUpVehicle(String plateNummber) {
        
    }
}   
