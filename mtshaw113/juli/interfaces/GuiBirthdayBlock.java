    package mtshaw113.juli.interfaces;
     
    import net.minecraft.client.Minecraft;
    import net.minecraft.client.gui.GuiScreen;
    import net.minecraft.util.ResourceLocation;
    import org.lwjgl.opengl.GL11;
    import cpw.mods.fml.relauncher.Side;
    import cpw.mods.fml.relauncher.SideOnly;
     
    @SideOnly(Side.CLIENT)
    public class GuiBirthdayBlock extends GuiScreen {
     
            private int windowW = 512;
            private int windowH = 256;
           
        public GuiBirthdayBlock() {}
       
        private static final ResourceLocation texture1 = new ResourceLocation("example", "textures/gui/bannerLeft.png");
            private static final ResourceLocation texture2 = new ResourceLocation("example", "textures/gui/bannerRight.png");
       
        @Override
        public void drawScreen(int mouseX, int mouseY, float var3) {
           
            this.drawDefaultBackground();
           
            GL11.glColor4f(1, 1, 1, 1);
           
            int guiStartX = Math.round((this.width - this.windowW) / 2);
            int guiStartY = Math.round((this.height - this.windowH) / 2);
           
            Minecraft.getMinecraft().func_110434_K().func_110577_a(texture1);
            drawTexturedModalRect(guiStartX, guiStartY, 0, 0, (int)(this.windowW/2), this.windowH);
                Minecraft.getMinecraft().func_110434_K().func_110577_a(texture2);
                    drawTexturedModalRect(guiStartX + (windowW/2), guiStartY, 0, 0, (int)(this.windowW/2), this.windowH);
        }
       
    }

