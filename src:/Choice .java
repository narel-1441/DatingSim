package Game;

import java.util.ArrayList;
import java.util.List;

class Choice {
    private String description;
    private List<Choice> options;

    public Choice(String description) {
        this.description = description;
        this.options = new ArrayList<>();
    }

    public void addOption(Choice option) {
        options.add(option);
    }

    public String getDescription() {
        return description;
    }

    public List<Choice> getOptions() {
        return options;
    }
}
