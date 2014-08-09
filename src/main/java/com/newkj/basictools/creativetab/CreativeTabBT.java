package com.newkj.basictools.creativetab;

import com.newkj.basictools.init.ModItems;
import com.newkj.basictools.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.WeightedRandom;

/**
 * Created by Phantom-newk on 9/08/2014.
 */
public class CreativeTabBT
{
    public static final CreativeTabs BT_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.flintShard;
        }

        @Override
    public String getTranslatedTabLabel()
        {
            return  "Basic Tools";
        }
    };




}
