package guru.springframework.domain;

import lombok.*;


@Getter
@Setter
public class Note {
    private String id;
    private Recipe recipe;
    private String recipeNotes;

    public Note() {
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Note;
    }

}
