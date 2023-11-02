public class Valet implements HotelService{
    private HotelService hotelService;
    
    public Valet(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    public void pickUpVehicle(String plateNummber) {
        Vehicle vehicle = hotelService.pickUpVehicle(plateNummber);
    }
}   
