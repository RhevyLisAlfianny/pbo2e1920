package interfacelatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikan cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        mahasiswa.kuliahDiKampus();

        System.out.println("--------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikan cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("--------------------------------------------");
    }
}
