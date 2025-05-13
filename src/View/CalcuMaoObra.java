/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Calculo.EnergiaMaoDeObra;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcuMaoObra extends JFrame {
    private JComboBox<String> cboxMaoDeObra;
    private JTextField txtTrabalhadores;
    private JTextField txtHrsDia;
    private JTextField txtDiasOp;
    private JTextField txtResultado;
    private JTextField txtResultadoTotal;
    private JButton btnEnMaoObra;

    private double emergiaTotalAcumulada = 0.0;

    public CalcuMaoObra() {
        setTitle("Calculo de Consumo de Energia de mão de Obra");
        setLayout(null);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblTitulo = new JLabel("Calculo de Consumo de Energia de mão de Obra");
        lblTitulo.setBounds(150, 10, 400, 30);
        add(lblTitulo);

        cboxMaoDeObra = new JComboBox<>(new String[]{
                "Técnico em Redes",
                "Técnico de TI",
                "Eng. Elétrico / Téc. Eletrotécnico",
                "Analista de Cibersegurança",
                "Técnico ou Engenheiro"
        });
        cboxMaoDeObra.setBounds(50, 50, 250, 25);
        add(cboxMaoDeObra);

        addLabel("N° de Trabalhadores:", 50, 90);
        txtTrabalhadores = addTextField(300, 90);

        addLabel("Quantas Horas de Trabalho por dia:", 50, 130);
        txtHrsDia = addTextField(300, 130);

        addLabel("Quantos dias de Operação:", 50, 170);
        txtDiasOp = addTextField(300, 170);

        txtResultado = addTextField(150, 210);
        txtResultado.setEditable(false);

        txtResultadoTotal = addTextField(320, 210);
        txtResultadoTotal.setEditable(false);

        btnEnMaoObra = new JButton("Confirmar Energia");
        btnEnMaoObra.setBounds(200, 260, 200, 30);
        add(btnEnMaoObra);

        btnEnMaoObra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int horasPorDia = Integer.parseInt(txtHrsDia.getText());
                    int diasOperacao = Integer.parseInt(txtDiasOp.getText());
                    int numTrabalhadores = Integer.parseInt(txtTrabalhadores.getText());

                    String profissaoSelecionada = cboxMaoDeObra.getSelectedItem().toString();
                    double energiaMediaHora = obterEnergiaMediaPorProfissao(profissaoSelecionada);

                    EnergiaMaoDeObra maoObra = new EnergiaMaoDeObra(numTrabalhadores, horasPorDia, diasOperacao, energiaMediaHora);
                    double emergiaAtual = maoObra.calcularFTFMaoDeObra();

                    txtResultado.setText(String.format("%.2e sej", emergiaAtual));
                    emergiaTotalAcumulada += emergiaAtual;
                    txtResultadoTotal.setText(String.format("%.2e sej", emergiaTotalAcumulada));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira apenas números válidos.");
                }
            }
        });

        setVisible(true);
    }

    private void addLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, 250, 25);
        add(label);
    }

    private JTextField addTextField(int x, int y) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, 150, 25);
        add(textField);
        return textField;
    }

    private double obterEnergiaMediaPorProfissao(String profissao) {
        switch (profissao) {
            case "Técnico de TI":
                return 1.8;
            case "Eng. Elétrico / Téc. Eletrotécnico":
                return 1.3;
            case "Analista de Cibersegurança":
                return 1.5;
            case "Técnico ou Engenheiro":
                return 2.0;
            case "Técnico em Redes":
            default:
                return 1.2;
        }
    }

    public static void main(String[] args) {
        new CalcuMaoObra();
    }
}
