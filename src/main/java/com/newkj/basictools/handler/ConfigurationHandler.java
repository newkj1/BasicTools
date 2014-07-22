package com.newkj.basictools.handler;

import com.newkj.basictools.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

/**
 * Created by Phantom-newk on 10/07/2014.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {
        //Create the configuration object from the given configuration file
        if (configuration == null) {
            Configuration configuration = new Configuration(configFile);
        }
    }


    @SubscribeEvent
    public void setConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync configs
        }

    }
    public void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");
        if (configuration.hasChanged())
        {
            configuration.save();

        }
    }
}

