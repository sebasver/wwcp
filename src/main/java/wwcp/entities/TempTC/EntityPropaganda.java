//This is a documentation file for copy pasting into a file with an open load freight carriage
package wwcp.entities.TempTC;

import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.RollingstockBase;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.RailUtility;
import ebf.timsquared.TiMSquared;
import ebf.timsquared.models.bogies.CMDBogie;
import ebf.timsquared.models.rollingstock.VATLogCar;
import fexcraft.tmt.slim.ModelBase;

import java.util.List;
import java.util.UUID;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wwcp.models.TCTemp.ModelPropagandaCar;
import wwcp.models.TCTemp.PropagandaCar;
import wwcp.worldwidecontentpack;

public class EntityPropaganda extends GenericRailTransport {


    public EntityPropaganda(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPropaganda(null), worldwidecontentpack.MODID, worldwidecontentpack.Belgium);

    public EntityPropaganda(World world) {
        super(world);
    }

    public String transportName() {
        return "Temp Propaganda car";
    }

    public String transportcountry() {
        return "US";
    }

    public String transportYear() {
        return "1850-1970";
    }

    public String transportFuelType() {
        return "Steam-Electric";
    }

    public float transportTopSpeed() {
        return 0.0F;
    }

    public float weightKg() {
        return 1814.3F;
    }

    public boolean isFictional() {
        return true;
    }

    public float transportTractiveEffort() {
        return 0.0F;
    }

    public float transportMetricHorsePower() {
        return 0.0F;
    }

    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate("wwcp.era") + "II"};
        }
    }

    public float getMaxFuel() {
        return 0.0F;
    }

    public int getInventoryRows() {
        return 3;
    }

    public float[][] bogieModelOffsets() {
        return null;
    }

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.0F, -1.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    public float[][] modelOffsets() {
        return (float[][]) null;
    }

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/TempFolder/Temp1.png","Temp 1", "Temp 1");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/TempFolder/Temp2.png","Temp 2", "Temp 2");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/TempFolder/Temp3.png","Temp 3", "Temp 3");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/TempFolder/Temp4.png","Temp 4", "Temp 4");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/TempFolder/Temp5.png","Temp 5", "Temp 5");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/TempFolder/Temp6.png","Temp 6", "Temp 6");

    }

    public boolean isReinforced() {
        return false;
    }

    public int[] getTankCapacity() {
        return null;
    }

    public String[][] getTankFilters() {
        return (String[][]) null;
    }

    public int getRFCapacity() {
        return 0;
    }

    public void manageFuel() {
    }

    public List<transportTypes> getTypes() {
        return transportTypes.LOGCAR.singleton();
    }

    public float[][] getRiderOffsets() {
        return (float[][]) null;
    }

    public float[] getHitboxSize() {
        return new float[]{5F, 3F, 1.2F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new PropagandaCar()};
    }

    public Item getItem() {
        return thisItem;
    }
}
