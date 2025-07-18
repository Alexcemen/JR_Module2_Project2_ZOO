package org.example.config;


import java.util.Properties;

public class Config {

    public final String bearImage;
    public final String foxImage;
    public final String tigerImage;
    public final String wolfImage;
    public final int animalHealth;
    public final int animalPowerAttack;
    public final int startCountAnimals;
    public final int sideField;
    public final String healingRuneImage;
    public final String poisonRuneImage;
    public final String powerAttackRuneImage;
    public final String cloningRuneImage;
    public final int healingRuneExecute;
    public final int poisonRuneExecute;
    public final int powerAttackRuneExecute;
    public final int animalMoveTick;
    public final int drawTick;
    public final int runesTick;
    public final int checkVictoryTick;

    private Config(Properties props) {
        this.bearImage = props.getProperty("bear_image");
        this.foxImage = props.getProperty("fox_image");
        this.tigerImage = props.getProperty("tiger_image");
        this.wolfImage = props.getProperty("wolf_image");
        this.animalHealth = Integer.parseInt(props.getProperty("animal_health"));
        this.animalPowerAttack = Integer.parseInt(props.getProperty("animal_power_attack"));
        this.startCountAnimals = Integer.parseInt(props.getProperty("start_count_animals"));
        this.sideField = Integer.parseInt(props.getProperty("side_field"));
        this.healingRuneImage = props.getProperty("healing_rune_image");
        this.poisonRuneImage = props.getProperty("poison_rune_image");
        this.powerAttackRuneImage = props.getProperty("power_attack_rune_image");
        this.cloningRuneImage = props.getProperty("cloning_rune_image");
        this.healingRuneExecute = Integer.parseInt(props.getProperty("healing_rune_execute"));
        this.poisonRuneExecute = Integer.parseInt(props.getProperty("poison_rune_execute"));
        this.powerAttackRuneExecute = Integer.parseInt(props.getProperty("power_attack_rune_execute"));
        this.animalMoveTick = Integer.parseInt(props.getProperty("animal_move_tick"));
        this.drawTick = Integer.parseInt(props.getProperty("draw_tick"));
        this.runesTick = Integer.parseInt(props.getProperty("runes_tick"));
        this.checkVictoryTick = Integer.parseInt(props.getProperty("check_victory_tick"));
    }

    public static Config load() {
        Properties props = new Properties();
        try (var in = Config.class.getResourceAsStream("/zoo.properties")) {
            if (in != null) props.load(in);
        } catch (Exception e) {
            throw new RuntimeException("Cannot read bot.bot.properties", e);
        }
        return new Config(props);
    }
}
