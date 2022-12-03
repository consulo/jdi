/**
 * @author VISTALL
 * @since 03/12/2022
 */
module consulo.internal.jdi {
	exports consulo.internal.com.sun.jdi;
	exports consulo.internal.com.sun.jdi.connect;
	exports consulo.internal.com.sun.jdi.connect.spi;
	exports consulo.internal.com.sun.jdi.event;
	exports consulo.internal.com.sun.jdi.request;
	exports consulo.internal.com.sun.tools.attach;
	exports consulo.internal.com.sun.tools.attach.spi;
	exports consulo.internal.com.sun.tools.jdi;

	uses consulo.internal.com.sun.jdi.connect.Connector;
	uses consulo.internal.com.sun.jdi.connect.spi.TransportService;

	provides consulo.internal.com.sun.jdi.connect.Connector with
			consulo.internal.com.sun.tools.jdi.SunCommandLineLauncher,
			consulo.internal.com.sun.tools.jdi.ProcessAttachingConnector,
			consulo.internal.com.sun.tools.jdi.RawCommandLineLauncher,
			consulo.internal.com.sun.tools.jdi.SocketAttachingConnector,
			consulo.internal.com.sun.tools.jdi.SocketListeningConnector;
}