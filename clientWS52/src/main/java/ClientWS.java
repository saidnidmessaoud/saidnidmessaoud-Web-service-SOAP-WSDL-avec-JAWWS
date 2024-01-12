import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;
import proxy.ListComptes;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub=new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(7600));
        Compte cp=stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        for (int i=0;i<stub.listComptes().size();i++){
            System.out.println(stub.listComptes().get(i).getCode());
            System.out.println(stub.listComptes().get(i).getSolde());
        }
    }
}
