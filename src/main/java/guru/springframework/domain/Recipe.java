package guru.springframework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Document
public class Recipe {
    @Id
    private String id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer serving;
    private String source;
    private String url;
    private String direction;
    private Difficulty difficulty;
    private Byte[] image;
    private Note note;
    private Set<Ingredient> ingredients = new HashSet<>();
    @DBRef
    private Set<Category> categories = new HashSet<>();


    public void setNote(Note note) {
        if (note != null)
            this.note = note;

    }
    public Recipe addIngredient(Ingredient ingredient) {
       // ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    }


}
