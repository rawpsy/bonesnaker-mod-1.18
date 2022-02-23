package au.com.snakerbone.recipe;

import au.com.snakerbone.SnakerBoneMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void register() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(SnakerBoneMod.MOD_ID, KunziteBlasterRecipe.Serializer.ID),
                KunziteBlasterRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(SnakerBoneMod.MOD_ID, KunziteBlasterRecipe.Type.ID),
                KunziteBlasterRecipe.Type.INSTANCE);
    }
}