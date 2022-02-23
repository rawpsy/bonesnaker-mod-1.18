package au.com.snakerbone.screen;

import au.com.snakerbone.SnakerBoneMod;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {

    public static ScreenHandlerType<KunziteBlasterScreenHandler> KUNZITE_BLASTER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(SnakerBoneMod.MOD_ID, "kunzite_blaster"),
                    KunziteBlasterScreenHandler::new);
}
