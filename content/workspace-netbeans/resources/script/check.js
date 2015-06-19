function request(xhr, status, args) {
    if (args.validationFailed) {
        PF('cadastroDialog').jq.effect("shake", {times: 5}, 100);
    }
}
