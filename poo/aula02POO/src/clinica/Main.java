package clinica;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DAO dao = new DAO();

        System.out.println("========== CRUD MÉDICO ==========");

        Medico medico = new Medico("Dr. Cleber", "666", "11999", "Cardiologia", "123");
        dao.inserirMedico(medico);

        System.out.println("\n--- Lista de Médicos ---");
        List<Medico> medicos = dao.listarMedicos();
        for (Medico m : medicos) {
            m.mostrar();
            System.out.println("---");
        }

        System.out.println("\n--- Buscar médico CRM 666 ---");
        Medico encontrado = dao.buscarMedico("666");
        if (encontrado != null) {
            encontrado.mostrar();
        }

        System.out.println("\n--- Atualizando médico ---");
        if (encontrado != null) {
            encontrado.setEspecialidade("Neurologia");
            encontrado.setTelefone("11988887777");
            dao.atualizarMedico(encontrado);
        }

        System.out.println("\n--- Excluindo médico CRM 666 ---");
        dao.excluirMedico("666");

        System.out.println("\n========== CRUD RECEPCIONISTA ==========");

        Recepcionista recep = new Recepcionista("Claúdia", "123456789-00", "11999", "321");
        dao.inserirRecepcionista(recep);

        System.out.println("\n--- Lista de Recepcionistas ---");
        List<Recepcionista> recepcionistas = dao.listarRecepcionistas();
        for (Recepcionista r : recepcionistas) {
            r.mostrar();
            System.out.println("---");
        }

        System.out.println("\n--- Buscar recepcionista CPF 123456789-00 ---");
        Recepcionista recepEncontrado = dao.buscarRecepcionista("123456789-00");
        if (recepEncontrado != null) {
            recepEncontrado.mostrar();
        }

        System.out.println("\n--- Atualizando recepcionista ---");
        if (recepEncontrado != null) {
            recepEncontrado.setTelefone("11977776666");
            dao.atualizarRecepcionista(recepEncontrado);
        }

        System.out.println("\n--- Excluindo recepcionista CPF 123456789-00 ---");
        dao.excluirRecepcionista("123456789-00");
    }
}
