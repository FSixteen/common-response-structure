module io.github.fsixteen.common.response.structure {

    requires static io.swagger.annotations;
    requires static io.swagger.v3.oas.annotations;
    requires static com.fasterxml.jackson.annotation;
    requires static org.yaml.snakeyaml;

    exports io.github.fsixteen.common.structure;
    exports io.github.fsixteen.common.structure.constants;
    exports io.github.fsixteen.common.structure.exceptions;
    exports io.github.fsixteen.common.structure.extend;
    exports io.github.fsixteen.common.structure.extend.errs;
    exports io.github.fsixteen.common.structure.extend.oks;
    exports io.github.fsixteen.common.structure.extend.with.serializable;
    exports io.github.fsixteen.common.structure.extend.with.serializable.errs;
    exports io.github.fsixteen.common.structure.extend.with.serializable.oks;
    exports io.github.fsixteen.common.structure.utils;
    exports io.github.fsixteen.common.structure.with.serializable;

}