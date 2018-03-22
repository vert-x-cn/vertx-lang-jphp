//package test.quercus;
//
//import com.caucho.quercus.QuercusContext;
//import com.caucho.quercus.env.Env;
//import com.caucho.quercus.env.NullValue;
//import com.caucho.quercus.env.Value;
//import com.caucho.quercus.function.AbstractFunction;
//import com.caucho.quercus.page.InterpretedPage;
//import com.caucho.quercus.page.QuercusPage;
//import com.caucho.quercus.parser.QuercusParser;
//import com.caucho.quercus.program.QuercusProgram;
//import com.caucho.vfs.ReadStream;
//import com.caucho.vfs.StdoutStream;
//import com.caucho.vfs.StringPath;
//import com.caucho.vfs.WriteStream;
//
//import java.io.IOException;
//import java.net.URL;
//
//public class TestPhp {
//    public static void main(String[] args) {
//        QuercusContext context = new QuercusContext();
//        context.setIni("error_reporting", "0");
//        context.addJavaClass("Test", Test.class);
//        context.init();
//        context.start();
//        addRequireVertxToContext(context);
//        context.start();
//
//        AbstractFunction func = context.findFunction(context.createString("phpinfo"));
//
//        if (func == null) {
//            throw new RuntimeException("PHP Environment didn't load properly");
//        }
//
//
//
//
//        String classLoaderScript = "spl_autoload_register(function($class) {" +
//                "require_vertx(str_replace('\\\\', '/', $class) . '.php');" +
//                "});";
//
//        // Evaluate a single line script which includes the verticle
//        // script. This ensures that exceptions can be accurately logged
//        // because Quercus will record actual file names rather than a
//        // generic "eval" name.
//        String scriptName = "vertx-lang-php/src/main/resources/index.php";
//        String script = String.format("<?php " + classLoaderScript + "require '%s'; ?>", scriptName);
//        WriteStream out;
//        Env globalEnv;
//        try (ReadStream reader = (new StringPath(script)).openRead()) {
//            QuercusProgram program = QuercusParser.parse(context, null, reader);
//            QuercusPage page = new InterpretedPage(program);
//
//            out = new InstantWriteStream(StdoutStream.create());
//            globalEnv = new Env(context, page, out, null, null);
//            globalEnv.start();
//
//            program.execute(globalEnv);
//            out.flush();
//        } catch (IOException e) {
//            throw new RuntimeException("Cannot parse PHP verticle: " + scriptName);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private static void addRequireVertxToContext(QuercusContext context) {
//        context.setFunction(context.createString("require_vertx"), new AbstractFunction() {
//
//            private static final long serialVersionUID = 5350698219672910902L;
//
//            @Override
//            public Value call(Env env, Value[] args) {
//                if (args.length != 1) {
//                    throw new IllegalArgumentException("require_vertx: missing Argument path");
//                }
//
//                String resourceName = args[0].toString();
//                URL resourcePath = TestPhp.class.getClassLoader().getResource(args[0].toString());
//                try {
//                    String script = String.format("require('%s');", resourcePath.toString());
//                    QuercusProgram program = context.parseCode(context.createString(script));
//                    program.execute(env);
//                } catch (NullPointerException np) {
//                    System.out.println(String.format("Could not find Vertx resource '%s''", resourceName));
//                    np.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                return NullValue.create();
//            }
//        });
//    }
//}
