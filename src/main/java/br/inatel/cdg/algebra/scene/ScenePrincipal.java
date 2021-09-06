package br.inatel.cdg.algebra.scene;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import br.inatel.cdg.algebra.mathClasses.Reta;

public class ScenePrincipal {

    // Label representam rótulos
    // TextField Representam áreas de texto
    // Button representa botoes
    private Label labelP1x, labelP1y, labelP2x, labelP2y;

    private TextField textFieldP1x, textFieldP1y, textFieldP2x, textFieldP2y;
    private TextField textFieldCoefAng, textFieldCoefLin;

    private Button btnCoefAng, btnCoefLin;

    public void criaScenePrincipal(Stage stage) {

        // Criando os labels para identificação das coordenadas dos pontos
        labelP1x = new Label("Ponto P1.X");
        labelP1y = new Label("Ponto P1.Y");
        labelP2x = new Label("Ponto P2.X");
        labelP2y = new Label("Ponto P2.Y");

        // Criando área de texto onde serão digitadas as coordenadas dos pontos
        textFieldP1x = new TextField();
        textFieldP1y = new TextField();
        textFieldP2x = new TextField();
        textFieldP2y = new TextField();

        // Agrupando os labels com os textFields horizontalmente
        HBox grupoHorizontalP1x = new HBox(labelP1x, textFieldP1x);
        HBox grupoHorizontalP1y = new HBox(labelP1y, textFieldP1y);
        HBox grupoHorizontalP2x = new HBox(labelP2x, textFieldP2x);
        HBox grupoHorizontalP2y = new HBox(labelP2y, textFieldP2y);

        // TextFields de apresentação de resultado
        textFieldCoefAng = new TextField();
        textFieldCoefLin = new TextField();

        // Desabilitando possibilidade de edição do texto
        textFieldCoefAng.setEditable(false);
        textFieldCoefLin.setEditable(false);

        textFieldCoefAng.setText("Coef Angular: ");
        textFieldCoefLin.setText("Coef Linear: ");

        System.out.println(textFieldCoefLin.getPromptText());

        HBox grupoHorizontalCoefs = new HBox(textFieldCoefAng, textFieldCoefLin);

        // Criação dos botões
        btnCoefAng = new Button("Cálculo Coeficiente Angular");
        btnCoefLin = new Button("Cálculo Coeficiente Linear");

        HBox grupoHorizontalBtns = new HBox(btnCoefAng, btnCoefLin);

        // Função de cálculo do coeficiente Angular
        btnCoefAng.setOnAction(evento -> {
            double P1x = Double.parseDouble(textFieldP1x.getText());
            double P1y = Double.parseDouble(textFieldP1y.getText());

            double P2x = Double.parseDouble(textFieldP2x.getText());
            double P2y = Double.parseDouble(textFieldP2y.getText());

            Reta reta = new Reta(P1x, P1y, P2x, P2y);

            textFieldCoefAng.setText("Coef Angular: " + String.valueOf(reta.calculaCoefAngular()));
        });

        // Função de cálculo do coeficiente Linear
        btnCoefLin.setOnAction(evento -> {
            double P1x = Double.parseDouble(textFieldP1x.getText());
            double P1y = Double.parseDouble(textFieldP1y.getText());

            double P2x = Double.parseDouble(textFieldP2x.getText());
            double P2y = Double.parseDouble(textFieldP2y.getText());

            Reta reta = new Reta(P1x, P1y, P2x, P2y);

            textFieldCoefLin.setText("Coef Linear: " + String.valueOf(reta.calculaCoefLinear()));
        });

        // VBox é usada para agrupar elementos verticalmente
        // No construtor passamos todos os elementos que serão agrupados, que podem ser
        // outros grupos
        VBox layoutFinal = new VBox(grupoHorizontalP1x, grupoHorizontalP1y, grupoHorizontalP2x, grupoHorizontalP2y,
                grupoHorizontalCoefs, grupoHorizontalBtns);
        // Criamos a Scene
        Scene scene = new Scene(layoutFinal, 400, 200);

        stage.setTitle("Software Para Calculos de Álgebra Linear");
        stage.setScene(scene);
        stage.show();
    }

}
