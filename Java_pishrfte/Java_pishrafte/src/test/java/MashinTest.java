public class MashinTest {
    class mashin{
        boolean mashin_roshanhast;
        boolean dar_bazehast;
        void roshanhast(){
            System.out.println("IS On");
            mashin_roshanhast = true;
        }

        void khamoshhast(){
            System.out.println("IS OFF");
            mashin_roshanhast = false;
        }
        void dar_bazhast(){
            System.out.println("Open");
            dar_bazehast = true;
        }
        void dar_bastehast(){
            System.out.println("close");
            dar_bazehast = false;
        }

        void harekat(){
            if(!dar_bazehast && mashin_roshanhast){
                System.out.println("Mashine dar hale harkat");
            } else {
                System.out.println("Mashine dar hale park");
            }
        }
    }

}
