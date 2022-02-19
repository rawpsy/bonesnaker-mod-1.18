package au.com.snakerbone.painting;

import au.com.snakerbone.SnakerBoneMod;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {

    public static final PaintingMotive JINX = registerPainting("jinx", new PaintingMotive(32,32));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(SnakerBoneMod.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings() {
        System.out.println("Registering Paintings For " + SnakerBoneMod.MOD_ID);
    }

}
