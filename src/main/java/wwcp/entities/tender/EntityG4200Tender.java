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
import wwcp.models.tenders.G4200Tender;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

public class EntityG4200Tender extends GenericRailTransport {


    public EntityG4200Tender(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityG4200Tender(null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityG4200Tender(World world) {
        super(world);
    }
    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.G4200().reinforced;
    }

    public int[] getTankCapacity() {
        return new int[] {Transport.G4200().tankcapacity, Transport.G4200().tankcapacity};
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
        return Transport.G4200().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.G4200().name;
    }

    public String transportcountry() { return Transport.G4200().country; }

    public String transportYear() { return Transport.G4200().year; }

    public float transportTopSpeed() {
        return Transport.G4200().topSpeed;
    }

    public boolean isFictional() {
        return Transport.G4200().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.G4200().additionalTextTitle) + Transport.G4200().additionalText,
                RailUtility.translate(Transport.G4200().additionalTextTitle2) + Transport.G4200().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.G4200().rows;
    }

    public transportTypes getType() {
        return transportTypes.FREIGHT;
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
//todo change bogie length from center
    public float[][] modelOffsets() {
        return new float[][]{{-0.075f,0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/LNERG4200Tender/LNER_4200G_Tender_Texture_2.png",
                "J39 Tender", "One of their smaller tanker cars, usually used for " +
                        "commodities such as molten sulfur, clay slurry, caustic soda and corn syrup.");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/LNERG4200Tender/LNER_4200G_Tender_Texture_3.png",
                "J38 Tender", "One of their smaller tanker cars, usually used for " +
                        "commodities such as molten sulfur, clay slurry, caustic soda and corn syrup.");
    }

    public List<transportTypes> getTypes() {
        return transportTypes.TANKER.singleton();
    }

    public float[][] getRiderOffsets() {
        return (float[][]) null;
    }

    public float[] getHitboxSize() {
        return new float[]{4F, 1.6F, 1.2F};
    }

    public Item getItem() {
        return thisItem;
    }

    public void manageFuel() {
        FuelHandler.manageTanker(this);
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new G4200Tender()};
    }
}

