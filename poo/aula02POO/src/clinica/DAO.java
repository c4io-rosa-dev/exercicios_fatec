package clinica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    private static final String URL = "jdbc:mysql://localhost:3310/clinica";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    public void inserirMedico(Medico m) {
        String sql = "INSERT INTO medico (nome, crm, telefone, especialidade, senha) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, m.getNome());
            ps.setString(2, m.getCrm());
            ps.setString(3, m.getTelefone());
            ps.setString(4, m.getEspecialidade());
            ps.setString(5, m.getSenha());
            ps.executeUpdate();
            System.out.println("Médico inserido com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao inserir médico: " + e.getMessage());
        }
    }

    public List<Medico> listarMedicos() {
        List<Medico> lista = new ArrayList<>();
        String sql = "SELECT nome, crm, telefone, especialidade, senha FROM medico";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new Medico(
                        rs.getString("nome"),
                        rs.getString("crm"),
                        rs.getString("telefone"),
                        rs.getString("especialidade"),
                        rs.getString("senha")
                ));
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar médicos: " + e.getMessage());
        }
        return lista;
    }

    public Medico buscarMedico(String crm) {
        String sql = "SELECT nome, crm, telefone, especialidade, senha FROM medico WHERE crm = ?";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, crm);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Medico(
                            rs.getString("nome"),
                            rs.getString("crm"),
                            rs.getString("telefone"),
                            rs.getString("especialidade"),
                            rs.getString("senha")
                    );
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar médico: " + e.getMessage());
        }
        return null;
    }

    public void atualizarMedico(Medico m) {
        String sql = "UPDATE medico SET nome = ?, telefone = ?, especialidade = ?, senha = ? WHERE crm = ?";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, m.getNome());
            ps.setString(2, m.getTelefone());
            ps.setString(3, m.getEspecialidade());
            ps.setString(4, m.getSenha());
            ps.setString(5, m.getCrm());
            ps.executeUpdate();
            System.out.println("Médico atualizado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar médico: " + e.getMessage());
        }
    }

    public void excluirMedico(String crm) {
        String sql = "DELETE FROM medico WHERE crm = ?";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, crm);
            ps.executeUpdate();
            System.out.println("Médico excluído com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao excluir médico: " + e.getMessage());
        }
    }

    public void inserirRecepcionista(Recepcionista r) {
        String sql = "INSERT INTO recepcionista (nome, cpf, telefone, senha) VALUES (?, ?, ?, ?)";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, r.getNome());
            ps.setString(2, r.getCpf());
            ps.setString(3, r.getTelefone());
            ps.setString(4, r.getSenha());
            ps.executeUpdate();
            System.out.println("Recepcionista inserido com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao inserir recepcionista: " + e.getMessage());
        }
    }

    public List<Recepcionista> listarRecepcionistas() {
        List<Recepcionista> lista = new ArrayList<>();
        String sql = "SELECT nome, cpf, telefone, senha FROM recepcionista";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new Recepcionista(
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("telefone"),
                        rs.getString("senha")
                ));
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar recepcionistas: " + e.getMessage());
        }
        return lista;
    }

    public Recepcionista buscarRecepcionista(String cpf) {
        String sql = "SELECT nome, cpf, telefone, senha FROM recepcionista WHERE cpf = ?";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cpf);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Recepcionista(
                            rs.getString("nome"),
                            rs.getString("cpf"),
                            rs.getString("telefone"),
                            rs.getString("senha")
                    );
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar recepcionista: " + e.getMessage());
        }
        return null;
    }

    public void atualizarRecepcionista(Recepcionista r) {
        String sql = "UPDATE recepcionista SET nome = ?, telefone = ?, senha = ? WHERE cpf = ?";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, r.getNome());
            ps.setString(2, r.getTelefone());
            ps.setString(3, r.getSenha());
            ps.setString(4, r.getCpf());
            ps.executeUpdate();
            System.out.println("Recepcionista atualizado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar recepcionista: " + e.getMessage());
        }
    }

    public void excluirRecepcionista(String cpf) {
        String sql = "DELETE FROM recepcionista WHERE cpf = ?";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cpf);
            ps.executeUpdate();
            System.out.println("Recepcionista excluído com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao excluir recepcionista: " + e.getMessage());
        }
    }
}
