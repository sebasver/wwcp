//This is a documentation file for copy pasting reussable details into a tender entity class.

//This is a documentation class for copy pasting into a freight tanker entity file.
package wwcp.entities.tender;

import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.AmericanTrucks.Vanderbuilt_Tender_Bogie;
import wwcp.models.tenders.CN_Vanderbuilt_Tender;
import wwcp.models.tenders.G4200Tender;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

public class EntityVanderBuiltTender extends GenericRailTransport {


    public EntityVanderBuiltTender(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityVanderBuiltTender(null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityVanderBuiltTender(World world) {
        super(world);
    }
    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.VanderBuilt().reinforced;
    }

    public int[] getTankCapacity() {
        return new int[] {Transport.VanderBuilt().tankcapacity, Transport.VanderBuilt().tankcapacity};
    }

    public String[] getTankFilters(int tankID) {
        switch (tankID) {
            case 0: {
                return new String[]{FluidRegistry.WATER.getName()};
            }
            default:{
                return new String[]{FluidRegistry.LAVA.getName()};
            }
        }
    }

    public float weightKg() {
        return Transport.VanderBuilt().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.VanderBuilt().name;
    }

    public String transportcountry() { return Transport.VanderBuilt().country; }

    public String transportYear() { return Transport.VanderBuilt().year; }

    public float transportTopSpeed() {
        return Transport.VanderBuilt().topSpeed;
    }

    public boolean isFictional() {
        return Transport.VanderBuilt().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.VanderBuilt().additionalTextTitle) + Transport.VanderBuilt().additionalText,
                RailUtility.translate(Transport.VanderBuilt().additionalTextTitle2) + Transport.VanderBuilt().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.VanderBuilt().rows;
    }

    public transportTypes getType() {
        return transportTypes.FREIGHT;
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.2f, 0f, 0}, {-1.0f, 0f, 0}};
    }

    public ModelBase[] bogieModels() {
        return new ModelBase[] {new Vanderbuilt_Tender_Bogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{5.0F, -5.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }
//todo change bogie length from center
    public float[][] modelOffsets() {
        return new float[][]{{-0.1f,0F,0F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/VanderBuilt/CN_Vanderbuilt_Tender_Green_Squarelogo_N.png",
                "textures/bogies/AmericanTrucks/Vanderbuilt_Truck_Black_N.png",
                "Highliner", "Blue");
    }

    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 180.0f, 0.0f}};}

    public List<transportTypes> getTypes() {
        return transportTypes.TANKER.singleton();
    }

    public float[][] getRiderOffsets() {
        return (float[][]) null;
    }

    public float[] getHitboxSize() {
        return new float[]{5.2F, 1.6F, 1.2F};
    }

    public Item getItem() {
        return thisItem;
    }

    public void manageFuel() {
        FuelHandler.manageTanker(this);
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new CN_Vanderbuilt_Tender()};
    }
}

