package wwcp.entities.locomotives;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TrainBase;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.FuelHandler;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import wwcp.worldwidecontentpack;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityNAME extends EntityTrainCore {

    public static final Item thisItem = new ItemTransport(new EntityNAME(null), worldwidecontentpack.MODID,worldwidecontentpack.COUNTRY);

    public EntityNAME(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }
    public EntityNAME(World world){super(world);
    }

    @Override
    public String transportName(){return "LMS Black 5";}
    @Override
    public String transportcountry(){return "UK";}
    @Override
    public String transportYear(){return "1934-1968";}
	
    @Override
    public boolean isFictional(){return false;}
	//Say False if it is real content, Type True if it is fictional
	
    @Override
    public float transportTractiveEffort(){return 25455;}

    @Override
    public float transportTopSpeed(){return 80;}

    @Override
    public float transportMetricHorsePower(){return NULL;}

    @Override
    public String[] additionalItemText() {
        return "Additional Info";
    }

    @Override
    public float weightKg(){return 73358.59 in KG;}

	