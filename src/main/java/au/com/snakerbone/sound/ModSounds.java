package au.com.snakerbone.sound;

import au.com.snakerbone.SnakerBoneMod;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModSounds {

    public static SoundEvent ORE_SNIFFER_FOUND_ORE = registerSoundEvent("ore_sniffer_found_ore");

    public static SoundEvent KUNZITE_LAMP_BREAK = registerSoundEvent("kunzite_lamp_break");
    public static SoundEvent KUNZITE_LAMP_FALL = registerSoundEvent("kunzite_lamp_fall");
    public static SoundEvent KUNZITE_LAMP_HIT = registerSoundEvent("kunzite_lamp_hit");
    public static SoundEvent KUNZITE_LAMP_PLACE = registerSoundEvent("kunzite_lamp_place");
    public static SoundEvent KUNZITE_LAMP_STEP = registerSoundEvent("kunzite_lamp_step");


    public static final BlockSoundGroup KUNZITE_SOUNDS = new BlockSoundGroup(1f, 1f,
            ModSounds.KUNZITE_LAMP_BREAK, ModSounds.KUNZITE_LAMP_STEP, ModSounds.KUNZITE_LAMP_PLACE, ModSounds.KUNZITE_LAMP_HIT, ModSounds.KUNZITE_LAMP_FALL);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(SnakerBoneMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

}
