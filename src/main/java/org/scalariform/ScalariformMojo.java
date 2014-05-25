package org.scalariform;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Goal which formats scala source files
 */
@Mojo(name = "format", defaultPhase = LifecyclePhase.PROCESS_SOURCES, threadSafe = true)
public class ScalariformMojo extends AbstractMojo {

    /**
     * Base directory of the project
     */
    @Parameter(property = "basedir", required = true)
    protected String baseDir;

    /**
     * Source file encoding, e.g. UTF-8. If not set, defaults to the platform default encoding.
     */
    @Parameter(property = "encoding", defaultValue = "${project.build.sourceEncoding}")
    protected String encoding;

    @Parameter(defaultValue = "false")
    protected boolean alignParameters;

    @Parameter(defaultValue = "false")
    protected boolean alignSingleLineCaseStatements;

    @Parameter(defaultValue = "40")
    protected int alignSingleLineCaseStatements_maxArrowIndent;

    @Parameter(defaultValue = "false")
    protected boolean compactControlReadability;

    @Parameter(defaultValue = "false")
    protected boolean compactStringConcatenation;

    @Parameter(defaultValue = "true")
    protected boolean doubleIndentClassDeclaration;

    @Parameter(defaultValue = "true")
    protected boolean formatXml;

    @Parameter(defaultValue = "false")
    protected boolean indentLocalDefs;

    @Parameter(defaultValue = "true")
    protected boolean indentPackageBlocks;

    @Parameter(defaultValue = "2")
    protected int indentSpaces;

    @Parameter(defaultValue = "false")
    protected boolean indentWithTabs;

    @Parameter(defaultValue = "false")
    protected boolean multilineScaladocCommentsStartOnFirstLine;

    @Parameter(defaultValue = "false")
    protected boolean placeScaladocAsterisksBeneathSecondAsterisk;

    @Parameter(defaultValue = "false")
    protected boolean preserveDanglingCloseParenthesis;

    @Parameter(defaultValue = "false")
    protected boolean preserveSpaceBeforeArguments;

    @Parameter(defaultValue = "false")
    protected boolean rewriteArrowSymbols;

    @Parameter(defaultValue = "false")
    protected boolean spaceBeforeColon;

    @Parameter(defaultValue = "false")
    protected boolean spaceInsideBrackets;

    @Parameter(defaultValue = "false")
    protected boolean spaceInsideParentheses;

    @Parameter(defaultValue = "true")
    protected boolean spacesWithinPatternBinders;

    public void execute() throws MojoExecutionException {

	MojoFormatter.format(baseDir, encoding, this.getLog(),
                             alignParameters,
                             alignSingleLineCaseStatements,
                             alignSingleLineCaseStatements_maxArrowIndent,
                             compactControlReadability,
                             compactStringConcatenation,
                             doubleIndentClassDeclaration,
                             formatXml,
                             indentLocalDefs,
                             indentPackageBlocks,
                             indentSpaces,
                             indentWithTabs,
                             multilineScaladocCommentsStartOnFirstLine,
                             placeScaladocAsterisksBeneathSecondAsterisk,
                             preserveDanglingCloseParenthesis,
                             preserveSpaceBeforeArguments,
                             rewriteArrowSymbols,
                             spaceBeforeColon,
                             spaceInsideBrackets,
                             spaceInsideParentheses,
                             spacesWithinPatternBinders);
    }
}
