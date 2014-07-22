package com.newkj.basictools.init;

import com.newkj.basictools.item.ItemBT;
import com.newkj.basictools.item.ItemCrumblingFlintShard;
import com.newkj.basictools.item.ItemFlintShard;
import com.newkj.basictools.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Items
    public static final ItemFlintShard flintShard = new ItemFlintShard();
    public static final ItemCrumblingFlintShard crumblingflintShard = new ItemCrumblingFlintShard();
    //Items

    public static void init()
    {
        //Item
        GameRegistry.registerItem(flintShard, "flintShard");
        GameRegistry.registerItem(crumblingflintShard, "crumblingflintShard");
        //item
    }

}