package au.com.snakerbone.sound;

import au.com.snakerbone.SnakerBoneMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModSounds {

    public static SoundEvent ORE_SNIFFER_FOUND_ORE = registerSoundEvent("ore_sniffer_found_ore");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(SnakerBoneMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

}
