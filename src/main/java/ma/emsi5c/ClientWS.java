package ma.emsi5c;

import proxy.BanqueService;
import proxy.BanqueService_Service;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub= new BanqueService_Service().getBanqueServicePort();
        System.out.println(stub.conversionEuroToDh(800));
        System.out.println(stub.getCompte(3).getSolde());
        System.out.println(stub.getCompte(3).getCode());
    }
}
