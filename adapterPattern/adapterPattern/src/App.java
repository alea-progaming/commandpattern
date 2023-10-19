public class App {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        PowerOutlet laptopPO = new LaptopAdapter(laptop);

        Refrigerator ref = new Refrigerator();
        PowerOutlet refPO = new RefrigeratorAdapter(ref);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphonePO = new SmartphoneAdapter(smartphoneCharger);

        //plug in laptop
        System.out.println();
        System.out.println(laptopPO.plugIn());

        System.out.println();
        //plug in refrigerator
        System.out.println(refPO.plugIn());

        System.out.println();
        //plug in smartphone charger
        System.out.println(smartphonePO.plugIn());
        System.out.println();




    }
}
