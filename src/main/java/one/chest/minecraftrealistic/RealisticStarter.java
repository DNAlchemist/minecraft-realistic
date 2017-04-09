package one.chest.minecraftrealistic;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


/**
 * Created by ruslanmikhalev on 09/04/17.
 */
@Mod(modid = RealisticStarter.MOD_ID, version = RealisticStarter.VERSION)
public class RealisticStarter {

    static final String MOD_ID = "minecraft-realistic";
    static final String VERSION = "0.1";

    @Mod.EventHandler
    void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(RealisticStarter.class);
    }
}