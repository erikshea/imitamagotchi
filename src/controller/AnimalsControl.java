package controller;

import java.io.IOException;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Dragon;
import animals.Monkey;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class AnimalsControl extends VBox{
    @FXML private MainWindowControl mainPane;
    
    public void initialize()
    {
    	
    }
    
    public AnimalsControl()
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("animals_control.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        
        try {
            loader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
	public void spawnRandomAnimals(int ammount)
	{
		int rand;
		for(int i = 0;i<ammount;i++)
		{
			 rand = (int)(1 + 4*Math.random());
			
			switch (rand)
			{
			case 1:
				this.addAnimalControl(this, new Cat());
				break;
			case 2:
				this.addAnimalControl(this, new Dog());
				break;
			case 3:
				this.addAnimalControl(this, new Monkey());
				break;
			case 4:
				this.addAnimalControl(this, new Dragon());
				break;
			}
		}
	}

	private <T extends Animal> void addAnimalControl(Pane p, T a) {
		this.getChildren().add(new AnimalControl<Animal>(a));
	}
	
	public void setMainPane(MainWindowControl p)
	{
		this.mainPane = p;
	}
	
}
